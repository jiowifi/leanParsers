import java.util.ArrayList;

class RootModel {

	public ArrayList<Social_linksModel> social_links;
	public String start_time;
	public CopyrightModel _copyright;
	public String location_name;
	public String schedule_published_on;
	public String background_image;
	public String type;
	public VersionModel _version;
	public Call_for_papersModel _call_for_papers;
	public String topic;
	public String end_time;
	public String description;
	public String organizer_name;
	public String timezone;
	public String email;
	public String name;
	public int id;
	public String organizer_description;
	public String logo;
	public String state;
	public String privacy;
	public CreatorModel _creator;
	public String code_of_conduct;

	public RootModel(ArrayList<Social_linksModel> social_links, String start_time, CopyrightModel copyright, String location_name, String schedule_published_on, String background_image, String type, VersionModel version, Call_for_papersModel call_for_papers, String topic, String end_time, String description, String organizer_name, String timezone, String email, String name, int id, String organizer_description, String logo, String state, String privacy, CreatorModel creator, String code_of_conduct) {

		this.social_links = social_links;
		this.start_time = start_time;
		this._copyright = copyright;
		this.location_name = location_name;
		this.schedule_published_on = schedule_published_on;
		this.background_image = background_image;
		this.type = type;
		this._version = version;
		this._call_for_papers = call_for_papers;
		this.topic = topic;
		this.end_time = end_time;
		this.description = description;
		this.organizer_name = organizer_name;
		this.timezone = timezone;
		this.email = email;
		this.name = name;
		this.id = id;
		this.organizer_description = organizer_description;
		this.logo = logo;
		this.state = state;
		this.privacy = privacy;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;

	}

}