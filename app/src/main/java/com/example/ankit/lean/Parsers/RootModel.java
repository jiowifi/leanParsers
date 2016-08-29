import java.util.ArrayList;

class RootModel {

	public int id;
	public String organizer_description;
	public String end_time;
	public String start_time;
	public String logo;
	public String description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public String location_name;
	public CopyrightModel _copyright;
	public String code_of_conduct;
	public String timezone;
	public CreatorModel _creator;
	public String schedule_published_on;
	public String type;
	public String email;
	public String name;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String privacy;
	public String background_image;
	public String state;
	public VersionModel _version;

	public RootModel(int id, String organizer_description, String end_time, String start_time, String logo, String description, String organizer_name, ArrayList<Social_linksModel> social_links, String location_name, CopyrightModel copyright, String code_of_conduct, String timezone, CreatorModel creator, String schedule_published_on, String type, String email, String name, Call_for_papersModel call_for_papers, String topic, String privacy, String background_image, String state, VersionModel version) {

		this.id = id;
		this.organizer_description = organizer_description;
		this.end_time = end_time;
		this.start_time = start_time;
		this.logo = logo;
		this.description = description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this.location_name = location_name;
		this._copyright = copyright;
		this.code_of_conduct = code_of_conduct;
		this.timezone = timezone;
		this._creator = creator;
		this.schedule_published_on = schedule_published_on;
		this.type = type;
		this.email = email;
		this.name = name;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.privacy = privacy;
		this.background_image = background_image;
		this.state = state;
		this._version = version;

	}

}