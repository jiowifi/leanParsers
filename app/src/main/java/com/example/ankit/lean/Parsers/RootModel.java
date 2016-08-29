import java.util.ArrayList;

class RootModel {

	public String timezone;
	public String background_image;
	public VersionModel _version;
	public CopyrightModel _copyright;
	public String logo;
	public String privacy;
	public String schedule_published_on;
	public String code_of_conduct;
	public CreatorModel _creator;
	public String state;
	public String end_time;
	public String organizer_name;
	public String email;
	public String location_name;
	public String type;
	public String description;
	public String organizer_description;
	public int id;
	public Call_for_papersModel _call_for_papers;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String name;
	public String topic;

	public RootModel(String timezone, String background_image, VersionModel version, CopyrightModel copyright, String logo, String privacy, String schedule_published_on, String code_of_conduct, CreatorModel creator, String state, String end_time, String organizer_name, String email, String location_name, String type, String description, String organizer_description, int id, Call_for_papersModel call_for_papers, String start_time, ArrayList<Social_linksModel> social_links, String name, String topic) {

		this.timezone = timezone;
		this.background_image = background_image;
		this._version = version;
		this._copyright = copyright;
		this.logo = logo;
		this.privacy = privacy;
		this.schedule_published_on = schedule_published_on;
		this.code_of_conduct = code_of_conduct;
		this._creator = creator;
		this.state = state;
		this.end_time = end_time;
		this.organizer_name = organizer_name;
		this.email = email;
		this.location_name = location_name;
		this.type = type;
		this.description = description;
		this.organizer_description = organizer_description;
		this.id = id;
		this._call_for_papers = call_for_papers;
		this.start_time = start_time;
		this.social_links = social_links;
		this.name = name;
		this.topic = topic;

	}

}