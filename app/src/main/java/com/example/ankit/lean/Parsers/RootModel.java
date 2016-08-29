import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String code_of_conduct;
	public String name;
	public CreatorModel _creator;
	public int id;
	public VersionModel _version;
	public String end_time;
	public ArrayList<Social_linksModel> social_links;
	public String logo;
	public String schedule_published_on;
	public String location_name;
	public String organizer_description;
	public String state;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public CopyrightModel _copyright;
	public String privacy;
	public String start_time;
	public String type;
	public String email;
	public String organizer_name;
	public String description;

	public RootModel(String background_image, String code_of_conduct, String name, CreatorModel creator, int id, VersionModel version, String end_time, ArrayList<Social_linksModel> social_links, String logo, String schedule_published_on, String location_name, String organizer_description, String state, String timezone, Call_for_papersModel call_for_papers, String topic, CopyrightModel copyright, String privacy, String start_time, String type, String email, String organizer_name, String description) {

		this.background_image = background_image;
		this.code_of_conduct = code_of_conduct;
		this.name = name;
		this._creator = creator;
		this.id = id;
		this._version = version;
		this.end_time = end_time;
		this.social_links = social_links;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.location_name = location_name;
		this.organizer_description = organizer_description;
		this.state = state;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this._copyright = copyright;
		this.privacy = privacy;
		this.start_time = start_time;
		this.type = type;
		this.email = email;
		this.organizer_name = organizer_name;
		this.description = description;

	}

}