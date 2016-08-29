import java.util.ArrayList;

class RootModel {

	public String state;
	public String email;
	public String timezone;
	public String background_image;
	public String schedule_published_on;
	public String description;
	public CreatorModel _creator;
	public String privacy;
	public CopyrightModel _copyright;
	public int id;
	public VersionModel _version;
	public String logo;
	public Call_for_papersModel _call_for_papers;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String type;
	public String organizer_description;
	public String code_of_conduct;
	public String topic;
	public String end_time;
	public String location_name;
	public String start_time;

	public RootModel(String state, String email, String timezone, String background_image, String schedule_published_on, String description, CreatorModel creator, String privacy, CopyrightModel copyright, int id, VersionModel version, String logo, Call_for_papersModel call_for_papers, String organizer_name, ArrayList<Social_linksModel> social_links, String name, String type, String organizer_description, String code_of_conduct, String topic, String end_time, String location_name, String start_time) {

		this.state = state;
		this.email = email;
		this.timezone = timezone;
		this.background_image = background_image;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._creator = creator;
		this.privacy = privacy;
		this._copyright = copyright;
		this.id = id;
		this._version = version;
		this.logo = logo;
		this._call_for_papers = call_for_papers;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.name = name;
		this.type = type;
		this.organizer_description = organizer_description;
		this.code_of_conduct = code_of_conduct;
		this.topic = topic;
		this.end_time = end_time;
		this.location_name = location_name;
		this.start_time = start_time;

	}

}