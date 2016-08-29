import java.util.ArrayList;

class RootModel {

	public String name;
	public String location_name;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public Call_for_papersModel _call_for_papers;
	public String privacy;
	public String description;
	public String logo;
	public String email;
	public String organizer_description;
	public String background_image;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public CreatorModel _creator;
	public String schedule_published_on;
	public int id;
	public String timezone;
	public String code_of_conduct;
	public String state;
	public String topic;
	public String type;
	public String organizer_name;

	public RootModel(String name, String location_name, String start_time, ArrayList<Social_linksModel> social_links, Call_for_papersModel call_for_papers, String privacy, String description, String logo, String email, String organizer_description, String background_image, CopyrightModel copyright, String end_time, VersionModel version, CreatorModel creator, String schedule_published_on, int id, String timezone, String code_of_conduct, String state, String topic, String type, String organizer_name) {

		this.name = name;
		this.location_name = location_name;
		this.start_time = start_time;
		this.social_links = social_links;
		this._call_for_papers = call_for_papers;
		this.privacy = privacy;
		this.description = description;
		this.logo = logo;
		this.email = email;
		this.organizer_description = organizer_description;
		this.background_image = background_image;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.timezone = timezone;
		this.code_of_conduct = code_of_conduct;
		this.state = state;
		this.topic = topic;
		this.type = type;
		this.organizer_name = organizer_name;

	}

}