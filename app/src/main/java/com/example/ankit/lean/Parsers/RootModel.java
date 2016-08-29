import java.util.ArrayList;

class RootModel {

	public String topic;
	public ArrayList<Social_linksModel> social_links;
	public String schedule_published_on;
	public String organizer_name;
	public String state;
	public int id;
	public String start_time;
	public String end_time;
	public String timezone;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CreatorModel _creator;
	public String name;
	public String description;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String email;
	public String logo;
	public String privacy;
	public String type;
	public String background_image;
	public VersionModel _version;
	public String code_of_conduct;

	public RootModel(String topic, ArrayList<Social_linksModel> social_links, String schedule_published_on, String organizer_name, String state, int id, String start_time, String end_time, String timezone, Call_for_papersModel call_for_papers, String location_name, CreatorModel creator, String name, String description, CopyrightModel copyright, String organizer_description, String email, String logo, String privacy, String type, String background_image, VersionModel version, String code_of_conduct) {

		this.topic = topic;
		this.social_links = social_links;
		this.schedule_published_on = schedule_published_on;
		this.organizer_name = organizer_name;
		this.state = state;
		this.id = id;
		this.start_time = start_time;
		this.end_time = end_time;
		this.timezone = timezone;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._creator = creator;
		this.name = name;
		this.description = description;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.email = email;
		this.logo = logo;
		this.privacy = privacy;
		this.type = type;
		this.background_image = background_image;
		this._version = version;
		this.code_of_conduct = code_of_conduct;

	}

}