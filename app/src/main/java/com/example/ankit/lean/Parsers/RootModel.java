import java.util.ArrayList;

class RootModel {

	public String code_of_conduct;
	public String email;
	public String timezone;
	public String location_name;
	public String privacy;
	public String organizer_name;
	public String type;
	public CopyrightModel _copyright;
	public CreatorModel _creator;
	public String logo;
	public String description;
	public String background_image;
	public Call_for_papersModel _call_for_papers;
	public ArrayList<Social_linksModel> social_links;
	public VersionModel _version;
	public String organizer_description;
	public String schedule_published_on;
	public String state;
	public String start_time;
	public String end_time;
	public String topic;
	public int id;
	public String name;

	public RootModel(String code_of_conduct, String email, String timezone, String location_name, String privacy, String organizer_name, String type, CopyrightModel copyright, CreatorModel creator, String logo, String description, String background_image, Call_for_papersModel call_for_papers, ArrayList<Social_linksModel> social_links, VersionModel version, String organizer_description, String schedule_published_on, String state, String start_time, String end_time, String topic, int id, String name) {

		this.code_of_conduct = code_of_conduct;
		this.email = email;
		this.timezone = timezone;
		this.location_name = location_name;
		this.privacy = privacy;
		this.organizer_name = organizer_name;
		this.type = type;
		this._copyright = copyright;
		this._creator = creator;
		this.logo = logo;
		this.description = description;
		this.background_image = background_image;
		this._call_for_papers = call_for_papers;
		this.social_links = social_links;
		this._version = version;
		this.organizer_description = organizer_description;
		this.schedule_published_on = schedule_published_on;
		this.state = state;
		this.start_time = start_time;
		this.end_time = end_time;
		this.topic = topic;
		this.id = id;
		this.name = name;

	}

}