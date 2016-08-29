import java.util.ArrayList;

class RootModel {

	public String schedule_published_on;
	public CreatorModel _creator;
	public String email;
	public Call_for_papersModel _call_for_papers;
	public String organizer_description;
	public VersionModel _version;
	public int id;
	public String end_time;
	public String privacy;
	public String type;
	public String background_image;
	public String timezone;
	public String organizer_name;
	public String topic;
	public String logo;
	public String name;
	public CopyrightModel _copyright;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public String description;
	public String state;
	public String start_time;
	public String code_of_conduct;

	public RootModel(String schedule_published_on, CreatorModel creator, String email, Call_for_papersModel call_for_papers, String organizer_description, VersionModel version, int id, String end_time, String privacy, String type, String background_image, String timezone, String organizer_name, String topic, String logo, String name, CopyrightModel copyright, ArrayList<Social_linksModel> social_links, String location_name, String description, String state, String start_time, String code_of_conduct) {

		this.schedule_published_on = schedule_published_on;
		this._creator = creator;
		this.email = email;
		this._call_for_papers = call_for_papers;
		this.organizer_description = organizer_description;
		this._version = version;
		this.id = id;
		this.end_time = end_time;
		this.privacy = privacy;
		this.type = type;
		this.background_image = background_image;
		this.timezone = timezone;
		this.organizer_name = organizer_name;
		this.topic = topic;
		this.logo = logo;
		this.name = name;
		this._copyright = copyright;
		this.social_links = social_links;
		this.location_name = location_name;
		this.description = description;
		this.state = state;
		this.start_time = start_time;
		this.code_of_conduct = code_of_conduct;

	}

}