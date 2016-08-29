import java.util.ArrayList;

class RootModel {

	public int id;
	public String name;
	public String logo;
	public String schedule_published_on;
	public String start_time;
	public ArrayList<Social_linksModel> social_links;
	public String topic;
	public String state;
	public String email;
	public CopyrightModel _copyright;
	public String end_time;
	public VersionModel _version;
	public String organizer_description;
	public String privacy;
	public String type;
	public Call_for_papersModel _call_for_papers;
	public String location_name;
	public CreatorModel _creator;
	public String organizer_name;
	public String timezone;
	public String background_image;
	public String description;
	public String code_of_conduct;

	public RootModel(int id, String name, String logo, String schedule_published_on, String start_time, ArrayList<Social_linksModel> social_links, String topic, String state, String email, CopyrightModel copyright, String end_time, VersionModel version, String organizer_description, String privacy, String type, Call_for_papersModel call_for_papers, String location_name, CreatorModel creator, String organizer_name, String timezone, String background_image, String description, String code_of_conduct) {

		this.id = id;
		this.name = name;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this.start_time = start_time;
		this.social_links = social_links;
		this.topic = topic;
		this.state = state;
		this.email = email;
		this._copyright = copyright;
		this.end_time = end_time;
		this._version = version;
		this.organizer_description = organizer_description;
		this.privacy = privacy;
		this.type = type;
		this._call_for_papers = call_for_papers;
		this.location_name = location_name;
		this._creator = creator;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.background_image = background_image;
		this.description = description;
		this.code_of_conduct = code_of_conduct;

	}

}