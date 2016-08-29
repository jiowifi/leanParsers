import java.util.ArrayList;

class RootModel {

	public String type;
	public String topic;
	public String schedule_published_on;
	public String description;
	public VersionModel _version;
	public String location_name;
	public String state;
	public CopyrightModel _copyright;
	public String timezone;
	public String privacy;
	public int id;
	public String logo;
	public String code_of_conduct;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String organizer_name;
	public String name;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public CreatorModel _creator;
	public String start_time;

	public RootModel(String type, String topic, String schedule_published_on, String description, VersionModel version, String location_name, String state, CopyrightModel copyright, String timezone, String privacy, int id, String logo, String code_of_conduct, String background_image, ArrayList<Social_linksModel> social_links, String end_time, String organizer_name, String name, String email, Call_for_papersModel call_for_papers, String organizer_description, CreatorModel creator, String start_time) {

		this.type = type;
		this.topic = topic;
		this.schedule_published_on = schedule_published_on;
		this.description = description;
		this._version = version;
		this.location_name = location_name;
		this.state = state;
		this._copyright = copyright;
		this.timezone = timezone;
		this.privacy = privacy;
		this.id = id;
		this.logo = logo;
		this.code_of_conduct = code_of_conduct;
		this.background_image = background_image;
		this.social_links = social_links;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.name = name;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._creator = creator;
		this.start_time = start_time;

	}

}