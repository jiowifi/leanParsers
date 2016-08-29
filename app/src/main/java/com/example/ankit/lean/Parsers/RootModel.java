import java.util.ArrayList;

class RootModel {

	public String description;
	public String code_of_conduct;
	public String privacy;
	public CreatorModel _creator;
	public String topic;
	public String start_time;
	public String organizer_description;
	public String type;
	public VersionModel _version;
	public ArrayList<Social_linksModel> social_links;
	public CopyrightModel _copyright;
	public Call_for_papersModel _call_for_papers;
	public String timezone;
	public String email;
	public String end_time;
	public String name;
	public String logo;
	public String location_name;
	public int id;
	public String background_image;
	public String state;
	public String schedule_published_on;
	public String organizer_name;

	public RootModel(String description, String code_of_conduct, String privacy, CreatorModel creator, String topic, String start_time, String organizer_description, String type, VersionModel version, ArrayList<Social_linksModel> social_links, CopyrightModel copyright, Call_for_papersModel call_for_papers, String timezone, String email, String end_time, String name, String logo, String location_name, int id, String background_image, String state, String schedule_published_on, String organizer_name) {

		this.description = description;
		this.code_of_conduct = code_of_conduct;
		this.privacy = privacy;
		this._creator = creator;
		this.topic = topic;
		this.start_time = start_time;
		this.organizer_description = organizer_description;
		this.type = type;
		this._version = version;
		this.social_links = social_links;
		this._copyright = copyright;
		this._call_for_papers = call_for_papers;
		this.timezone = timezone;
		this.email = email;
		this.end_time = end_time;
		this.name = name;
		this.logo = logo;
		this.location_name = location_name;
		this.id = id;
		this.background_image = background_image;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;

	}

}