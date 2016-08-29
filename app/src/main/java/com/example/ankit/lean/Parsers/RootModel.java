import java.util.ArrayList;

class RootModel {

	public String background_image;
	public String description;
	public String start_time;
	public int id;
	public String topic;
	public String privacy;
	public String timezone;
	public CopyrightModel _copyright;
	public String organizer_description;
	public String organizer_name;
	public ArrayList<Social_linksModel> social_links;
	public CreatorModel _creator;
	public String logo;
	public String schedule_published_on;
	public Call_for_papersModel _call_for_papers;
	public String code_of_conduct;
	public String type;
	public String end_time;
	public VersionModel _version;
	public String name;
	public String location_name;
	public String email;
	public String state;

	public RootModel(String background_image, String description, String start_time, int id, String topic, String privacy, String timezone, CopyrightModel copyright, String organizer_description, String organizer_name, ArrayList<Social_linksModel> social_links, CreatorModel creator, String logo, String schedule_published_on, Call_for_papersModel call_for_papers, String code_of_conduct, String type, String end_time, VersionModel version, String name, String location_name, String email, String state) {

		this.background_image = background_image;
		this.description = description;
		this.start_time = start_time;
		this.id = id;
		this.topic = topic;
		this.privacy = privacy;
		this.timezone = timezone;
		this._copyright = copyright;
		this.organizer_description = organizer_description;
		this.organizer_name = organizer_name;
		this.social_links = social_links;
		this._creator = creator;
		this.logo = logo;
		this.schedule_published_on = schedule_published_on;
		this._call_for_papers = call_for_papers;
		this.code_of_conduct = code_of_conduct;
		this.type = type;
		this.end_time = end_time;
		this._version = version;
		this.name = name;
		this.location_name = location_name;
		this.email = email;
		this.state = state;

	}

}