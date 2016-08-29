import java.util.ArrayList;

class RootModel {

	public String email;
	public String type;
	public String schedule_published_on;
	public CreatorModel _creator;
	public String state;
	public String privacy;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String organizer_name;
	public String description;
	public String topic;
	public String logo;
	public String organizer_description;
	public int id;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public String location_name;
	public String timezone;
	public String background_image;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String end_time;

	public RootModel(String email, String type, String schedule_published_on, CreatorModel creator, String state, String privacy, String name, ArrayList<Social_linksModel> social_links, String organizer_name, String description, String topic, String logo, String organizer_description, int id, VersionModel version, Call_for_papersModel call_for_papers, String start_time, String location_name, String timezone, String background_image, CopyrightModel copyright, String code_of_conduct, String end_time) {

		this.email = email;
		this.type = type;
		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.state = state;
		this.privacy = privacy;
		this.name = name;
		this.social_links = social_links;
		this.organizer_name = organizer_name;
		this.description = description;
		this.topic = topic;
		this.logo = logo;
		this.organizer_description = organizer_description;
		this.id = id;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.location_name = location_name;
		this.timezone = timezone;
		this.background_image = background_image;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.end_time = end_time;

	}

}