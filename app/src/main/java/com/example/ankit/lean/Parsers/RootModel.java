import java.util.ArrayList;

class RootModel {

	public String timezone;
	public VersionModel _version;
	public String start_time;
	public String state;
	public CreatorModel _creator;
	public String type;
	public String organizer_name;
	public String background_image;
	public String organizer_description;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public CopyrightModel _copyright;
	public int id;
	public String logo;
	public String name;
	public ArrayList<Social_linksModel> social_links;
	public String description;
	public String code_of_conduct;
	public String email;
	public String topic;
	public String privacy;
	public String location_name;
	public String end_time;

	public RootModel(String timezone, VersionModel version, String start_time, String state, CreatorModel creator, String type, String organizer_name, String background_image, String organizer_description, String schedule_published_on, Call_for_papersModel call_for_papers, CopyrightModel copyright, int id, String logo, String name, ArrayList<Social_linksModel> social_links, String description, String code_of_conduct, String email, String topic, String privacy, String location_name, String end_time) {

		this.timezone = timezone;
		this._version = version;
		this.start_time = start_time;
		this.state = state;
		this._creator = creator;
		this.type = type;
		this.organizer_name = organizer_name;
		this.background_image = background_image;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this._copyright = copyright;
		this.id = id;
		this.logo = logo;
		this.name = name;
		this.social_links = social_links;
		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.topic = topic;
		this.privacy = privacy;
		this.location_name = location_name;
		this.end_time = end_time;

	}

}