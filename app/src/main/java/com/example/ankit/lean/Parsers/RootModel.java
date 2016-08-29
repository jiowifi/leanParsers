import java.util.ArrayList;

class RootModel {

	public Call_for_papersModel _call_for_papers;
	public String logo;
	public CopyrightModel _copyright;
	public String email;
	public String organizer_description;
	public String name;
	public String type;
	public String description;
	public String location_name;
	public CreatorModel _creator;
	public String code_of_conduct;
	public VersionModel _version;
	public String timezone;
	public String privacy;
	public String background_image;
	public ArrayList<Social_linksModel> social_links;
	public String end_time;
	public String topic;
	public String organizer_name;
	public String state;
	public String schedule_published_on;
	public int id;
	public String start_time;

	public RootModel(Call_for_papersModel call_for_papers, String logo, CopyrightModel copyright, String email, String organizer_description, String name, String type, String description, String location_name, CreatorModel creator, String code_of_conduct, VersionModel version, String timezone, String privacy, String background_image, ArrayList<Social_linksModel> social_links, String end_time, String topic, String organizer_name, String state, String schedule_published_on, int id, String start_time) {

		this._call_for_papers = call_for_papers;
		this.logo = logo;
		this._copyright = copyright;
		this.email = email;
		this.organizer_description = organizer_description;
		this.name = name;
		this.type = type;
		this.description = description;
		this.location_name = location_name;
		this._creator = creator;
		this.code_of_conduct = code_of_conduct;
		this._version = version;
		this.timezone = timezone;
		this.privacy = privacy;
		this.background_image = background_image;
		this.social_links = social_links;
		this.end_time = end_time;
		this.topic = topic;
		this.organizer_name = organizer_name;
		this.state = state;
		this.schedule_published_on = schedule_published_on;
		this.id = id;
		this.start_time = start_time;

	}

}